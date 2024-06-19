package caceres.karen.alke_wallet

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import caceres.karen.alke_wallet.model.database.AppDataBase
import caceres.karen.alke_wallet.model.database.UsuarioEntidad
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AppDataBaseTest {
    private lateinit var miBaseDeDatos: AppDataBase

    @Before
    fun setup() {
        // Crear una instancia de la base de datos de prueba
        miBaseDeDatos = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            AppDataBase::class.java
        )
            .allowMainThreadQueries()
            .build()
    }

    @After
    fun tearDown() {
        // Cerrar la base de datos después de cada prueba
        miBaseDeDatos.close()
    }

    @Test
    fun testInsertarDataRecuperar() {
        // Insertar datos en la base de datos
        val datos = ArrayList<UsuarioEntidad>()
        datos.add(
            UsuarioEntidad(
                id_api = 1,
                firstName = "Karen",
                lastName = "Caceres",
                email = "kcaceres@test.com",
                password = "123456"
            )
        )
                    miBaseDeDatos . usuarioDao ().insertarDataDB(datos)
            // Recuperar el dato insertado
            val datoRecuperado =
        miBaseDeDatos.usuarioDao().obtenerUsuariosDB()
        // Verificar que el dato recuperado sea el mismo que elinsertado
        Assert.assertEquals("Morgan Stanley", datoRecuperado[0].firstName)
    }

}