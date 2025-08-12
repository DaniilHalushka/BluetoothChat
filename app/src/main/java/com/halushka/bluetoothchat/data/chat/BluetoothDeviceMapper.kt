package com.halushka.bluetoothchat.data.chat

import android.annotation.SuppressLint
import com.halushka.bluetoothchat.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun android.bluetooth.BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name ?: "Unknown",
        address = address
    )
}