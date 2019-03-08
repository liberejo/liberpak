package org.liberejo.liberpak

import com.badlogic.gdx.Gdx
import org.kodein.di.Kodein
import org.liberejo.api.mod.plugin.LiberejoPlugin

class Liberpak(override val kodein: Kodein) : LiberejoPlugin() {
    override fun onLoad() {
        Gdx.app.log("Liberepak", "Loaded")
    }

    override fun onUnload() {
        Gdx.app.log("Liberpak", "Unloaded")
    }
}