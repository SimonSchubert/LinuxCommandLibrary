# TAGLINE

Remove yellow tracking dots from white areas of a scan

# TLDR

**Clean** a scan and write a new image

```deda_clean_document [scan.png] [cleaned.png]```

Also convert the result to **greyscale**

```deda_clean_document --secure [scan.png] [cleaned.png]```

# SYNOPSIS

**deda_clean_document** [_options_] _input_ _output_

# PARAMETERS

_input_

> Scan to read.

_output_

> File to write. The extension selects the output format.

**-s**, **--secure**

> Convert the cleaned image to greyscale.

**-g**, **--grayscale**

> Same as **--secure**.

# DESCRIPTION

**deda_clean_document** tries to remove yellow tracking dots from the white areas of a scanned page and writes the result to _output_. **--secure** (and its alias **--grayscale**) converts that result to greyscale, which drops the colour channel the dots are printed in.

This operates on a scan. It does not change a PDF that is about to be printed. Covering dots on a new printout is the job of **deda_anonmask_create** and **deda_anonmask_apply**.

# CAVEATS

Dots that sit on top of a photograph or other non-white ink are outside what this command removes. Greyscale mode discards colour from the whole page, not only the dots.

The command overwrites _output_ when that path already exists. It does not ask for confirmation.

# HISTORY

**deda_clean_document** is part of **DEDA**, written by **Timo Richter** and **Stephan Escher** and described in their **2018** paper on forensic analysis and anonymisation of printed documents.

# SEE ALSO

[deda_parse_print](/man/deda_parse_print)(1), [deda_anonmask_create](/man/deda_anonmask_create)(1), [deda_anonmask_apply](/man/deda_anonmask_apply)(1)

# RESOURCES

```[Source code](https://github.com/dfd-tud/deda)```

<!-- verified: 2026-10-06 -->
