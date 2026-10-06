# TAGLINE

Read tracking dots from a scanned colour-laser page

# TLDR

**Decode** the tracking pattern in a 300 dpi scan

```deda_parse_print [page.png]```

Pass the scan **resolution** when the file does not record it

```deda_parse_print -d [300] [page.png]```

Only **name the pattern**, and skip decoding

```deda_parse_print --only-detect [page.png]```

Supply a **mask** when the scan is already a monochrome dot image

```deda_parse_print --mask [inked.png] [dots.png]```

# SYNOPSIS

**deda_parse_print** [_options_] _file_

# PARAMETERS

_file_

> Scan to read. Lossless images such as PNG work better than JPEG.

**-d** _dpi_, **--dpi** _dpi_

> Resolution of the scan. **0**, the default, asks the reader to detect it.

**-m** _file_, **--mask** _file_

> Inked-area mask. Use this when _file_ is a monochrome image of the dots rather than a full-colour scan.

**-o**, **--only-detect**

> Print the pattern id and exit without decoding the payload.

**-v**, **--verbose**

> Repeat to print more diagnostic detail.

# DESCRIPTION

**deda_parse_print** looks for the yellow tracking-dot pattern that many colour laser printers put on a page, then prints the pattern it found and, when it can, the decoded fields. Those fields can include a manufacturer, a serial number, a timestamp, and the raw matrix. The input should be a lossless scan at about **300** dpi, with the scanner's contrast left neutral so the dots are not thresholded away.

If no pattern is found, the command says so and suggests a 300 dpi lossless scan. When several valid matrices are present, it lists each decoded matrix and how often it occurred.

# CAVEATS

Monochrome pages and inkjet prints often have no tracking dots, so a clean result does not by itself prove anything about the printer. A scanner or driver that removes paper texture can erase the dots before this command sees them.

The decoder knows specific patterns. An unknown layout needs **deda_extract_yd** first. DPI detection falls back to a guess when the file does not record a resolution; pass **-d** for a scan that is not 300 dpi.

# HISTORY

**deda_parse_print** is part of **DEDA** (tracking Dots Extraction, Decoding and Anonymisation), written by **Timo Richter** and **Stephan Escher** and described in their **2018** paper on forensic analysis and anonymisation of printed documents. The tools are Python programs installed with the **deda** package.

# SEE ALSO

[deda_extract_yd](/man/deda_extract_yd)(1), [deda_compare_prints](/man/deda_compare_prints)(1), [deda_clean_document](/man/deda_clean_document)(1), [deda_anonmask_create](/man/deda_anonmask_create)(1)

# RESOURCES

```[Source code](https://github.com/dfd-tud/deda)```

<!-- verified: 2026-10-06 -->
