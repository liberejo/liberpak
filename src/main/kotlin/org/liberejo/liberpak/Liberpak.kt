package org.liberejo.liberpak

import com.badlogic.gdx.Gdx
import org.kodein.di.Kodein
import org.liberejo.api.plugin.plugin.LiberejoPlugin
import org.liberejo.launcher.DesktopLauncher

class Liberpak(override val kodein: Kodein) : LiberejoPlugin() {
    override fun load() {
        Gdx.app.log("Liberpak", "Loaded! :)")
    }

    override fun unload() {
        Gdx.app.log("Liberpak", "Unloaded")
    }

    fun main() {
        DesktopLauncher.startDesktopApp()
    }
}