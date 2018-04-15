package de.kevcodez.pubg.model.telemetry.events

import de.kevcodez.pubg.model.telemetry.objects.Character
import de.kevcodez.pubg.model.telemetry.objects.Item

class ItemPickup : TelemetryEvent() {
    lateinit var character: Character
    lateinit var item: Item
}