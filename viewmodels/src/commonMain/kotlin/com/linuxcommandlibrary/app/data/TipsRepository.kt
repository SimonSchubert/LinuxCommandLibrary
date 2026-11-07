package com.linuxcommandlibrary.app.data

import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.TipInfo
import com.linuxcommandlibrary.shared.platform.AssetReader
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

class TipsRepository(private val assetReader: AssetReader) {

    fun getTips(): ImmutableList<TipInfo> = try {
        assetReader.readFile("tips.md")?.let(MarkdownParser::parseTips) ?: persistentListOf()
    } catch (e: Exception) {
        persistentListOf()
    }
}
