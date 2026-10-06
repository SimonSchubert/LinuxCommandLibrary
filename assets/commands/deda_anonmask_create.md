# TAGLINE

Build a calibration mask for printer tracking dots

# TLDR

**Write** the calibration page

```deda_anonmask_create -w```

**Read** a scan of that page and write the mask

```deda_anonmask_create -r [calibration.png]```

Copy the printer's dot pattern into the mask **instead of anonymising** it

```deda_anonmask_create -r [calibration.png] --copy```

# SYNOPSIS

**deda_anonmask_create** **-w** [_options_]

**deda_anonmask_create** **-r** _file_ [_options_]

# PARAMETERS

**-w**, **--write**

> Write a calibration PDF to **testpage.pdf** in the working directory. Mutually exclusive with **-r**.

**-r** _file_, **--read** _file_

> Read a scan of a printed calibration page and write **mask.json**. Mutually exclusive with **-w**.

**-c**, **--copy**

> Store the printer's own dot pattern in the mask instead of an anonymising pattern. Used with **-r**.

**-v**, **--verbose**

> Repeat to print more diagnostic detail.

# DESCRIPTION

**deda_anonmask_create** is the first half of DEDA's print anonymisation. **-w** writes **testpage.pdf**. Print that file with no page margin, scan the printout at about **300** dpi in a lossless format, and pass the scan to **-r**. The command writes **mask.json**, which **deda_anonmask_apply** stamps onto later PDFs before they are printed.

One of **-w** or **-r** is required. **--copy** makes the mask reproduce the dots the printer already prints, rather than a pattern meant to hide them.

# CAVEATS

**-w** always writes **testpage.pdf**, and **-r** always writes **mask.json**, both in the current directory. Existing files at those names are overwritten.

The scan has to show the calibration dots. Margin scaling, a lossy format, or a driver that drops the yellow channel produces a mask that will not line up. **--copy** is a different operation from anonymisation: the printed page still carries a readable pattern.

# HISTORY

**deda_anonmask_create** is part of **DEDA**, written by **Timo Richter** and **Stephan Escher** and described in their **2018** paper on forensic analysis and anonymisation of printed documents.

# SEE ALSO

[deda_anonmask_apply](/man/deda_anonmask_apply)(1), [deda_parse_print](/man/deda_parse_print)(1), [deda_create_dots](/man/deda_create_dots)(1), [deda_clean_document](/man/deda_clean_document)(1)

# RESOURCES

```[Source code](https://github.com/dfd-tud/deda)```

<!-- verified: 2026-10-06 -->
