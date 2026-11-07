package com.linuxcommandlibrary.nativecli.screens

import com.linuxcommandlibrary.nativecli.data.DataRepository
import com.linuxcommandlibrary.shared.TipInfo

class TipsScreen :
    ListScreen<TipInfo>(
        title = "Tips",
        values = DataRepository.getTips(),
        label = { it.title },
        open = ::TipDetailScreen,
    )
