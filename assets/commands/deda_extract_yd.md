# TAGLINE

Extract yellow tracking dots from a scanned page

# TLDR

**Extract** the dot pattern from a scan

```deda_extract_yd [page.png]```

Set the scan **resolution**

```deda_extract_yd -d [300] [page.png]```

Write **debug images** while the dots are isolated

```deda_extract_yd --debug [page.png]```

Pass a geometric **translation code**

```deda_extract_yd -c [1,1,0.0,0.0] [page.png]```

# SYNOPSIS

**deda_extract_yd** [_options_] _file_

# PARAMETERS

_file_

> Scan to analyse.

**-d** _dpi_, **--dpi** _dpi_

> Resolution of the scan. **0**, the default, asks the reader to detect it. Detection that fails assumes an A4 page and prints the assumption on standard error.

**-m** _file_, **--mask** _file_

> Inked-area mask, used when _file_ is a monochrome image of the dots rather than a colour scan. Requires **-d** with a non-zero resolution. Cannot be combined with **--expose**.

**-e**, **--expose**

> Write the exposed-dot image and return before the grid is measured.

**--no-crop**

> Do not crop the page down to the region that contains dots.

**-c** _code_, **--code** _code_

> Translation code as four comma-separated values: two integers and two floats. A question mark leaves that value unset.

**--debug**

> Write intermediate images named **yd_*.png** in the working directory.

**-v**, **--verbose**

> Repeat to print more of the detection steps.

# DESCRIPTION

**deda_extract_yd** isolates the yellow tracking dots on a colour-laser scan and measures their grid. It prints the detected pattern as four numbers (two integers and two floats) when measurement succeeds. Use it when **deda_parse_print** does not recognise the layout and the dot positions themselves are what you need.

**--debug** saves the intermediate masks and crops. **--expose** ends once the dots have been separated from the page.

# CAVEATS

The reader expects a colour scan in which the yellow dots are still visible. JPEG compression, aggressive thresholding, and a wrong DPI hide or shift the grid. If the file has no usable DPI metadata, the command assumes an A4 page and says so on standard error.

**--debug** writes **yd_*.png** files in the current directory and will overwrite an older file of the same name.

# HISTORY

**deda_extract_yd** is part of **DEDA**, written by **Timo Richter** and **Stephan Escher** and described in their **2018** paper on forensic analysis and anonymisation of printed documents.

# SEE ALSO

[deda_parse_print](/man/deda_parse_print)(1), [deda_compare_prints](/man/deda_compare_prints)(1), [deda_anonmask_create](/man/deda_anonmask_create)(1)

# RESOURCES

```[Source code](https://github.com/dfd-tud/deda)```

<!-- verified: 2026-10-06 -->
