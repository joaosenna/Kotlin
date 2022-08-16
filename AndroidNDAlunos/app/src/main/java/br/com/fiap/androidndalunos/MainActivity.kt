package br.com.fiap.androidndalunos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val drawerLayout: DrawerLayout = binding.
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)

        appBarConfiguration = AppBarConfiguration(
        setOf(R.id.alunosFragment, R.id.formAlunoFragment, R.id.perfilFragment)
        drawerlayout
        )
    setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        override fun onSupportNavigateUp():Boolean{
        }


        val navController = findNavController(R.id.nav_host_fragment_content_main)

            return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()

        }
}