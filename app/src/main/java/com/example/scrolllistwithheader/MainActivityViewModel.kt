package com.example.scrolllistwithheader

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    private val words = listOf(
        "Zizzing Zest",
        "Groovy Glow",
        "Pixelated Pixie",
        "Cryptic Codex",
        "Gleaming Glimmer",
        "Whispering Willow",
        "Fuzzy Flurries",
        "Holographic Hum",
        "Cosmic Cacophony",
        "Bubbling Bliss",
        "Glitching Galaxy",
        "Dancing Dewdrop",
        "Sunken Sonata",
        "Bumbling Bongo",
        "Shimmering Shimmer",
        "Whistling Wisp",
        "Glittering Glitch",
        "Echoing Enigma",
        "Cackling Cauldron",
        "Ample Waterfall",
        "Holographic Hummingbird",
        "Whispering Windchime",
        "Bouncing Boondoggle",
        "Cosmic Catapult",
        "Whispering Whimsy",
        "Glimmering Gadget",
        "Pixelated Pixy Dust",
        "Bouncing Bewilderment",
        "Cosmic Catastrophe",
        "Cackling Comet",
        "Bumbling Blizzard",
        "Whistling Whirlwind",
        "Glittering Glitchwave",
        "Dancing Dandelion",
        "Echoing Ecstasy",
        "Sunken Seahorse",
        "Holographic Harmony",
        "Whispering Windmill",
        "Pixelated Playground",
        "Bouncing Bonanza"
    ).sorted().groupBy{ it[0] }

    fun getAllList(): Map<Char, List<String>> {
        return words
    }
}