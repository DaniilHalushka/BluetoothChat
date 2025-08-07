package com.halushka.bluetoothchat.presentation

import com.halushka.bluetoothchat.domain.chat.BluetoothDevice

data class BluetoothUIState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
)
