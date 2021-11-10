package com.trialmobile.simplescanner.adapters

import java.io.File

interface ImageAdapterListener {
    fun onSaveButtonClicked(image: File)
}