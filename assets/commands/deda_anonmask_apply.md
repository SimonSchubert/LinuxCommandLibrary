# TAGLINE

Apply a tracking-dot mask to a PDF before printing

# TLDR

**Apply** a mask and write **masked.pdf**

```deda_anonmask_apply [mask.json] [document.pdf]```

Shift the pattern by a fraction of an **inch**

```deda_anonmask_apply --xoffset [0.01] --yoffset [-0.02] [mask.json] [document.pdf]```

Change the **dot radius**

```deda_anonmask_apply --dotradius [0.005] [mask.json] [document.pdf]```

Draw the dots in **magenta** so they are easy to see

```deda_anonmask_apply --debug [mask.json] [document.pdf]```

# SYNOPSIS

**deda_anonmask_apply** [_options_] _mask_ _pdf_

# PARAMETERS

_mask_

> Mask file written by **deda_anonmask_create -r**, usually **mask.json**.

_pdf_

> PDF to stamp. The original file is not modified.

**--xoffset** _inches_, **--yoffset** _inches_

> Extra horizontal and vertical shift of the dot grid, in inches.

**--dotradius** _inches_

> Radius of each dot, in inches. The default is the toolkit's built-in radius.

**--debug**

> Draw magenta dots instead of yellow ones.

**-v**, **--verbose**

> Repeat to print more diagnostic detail.

# DESCRIPTION

**deda_anonmask_apply** reads a mask from **deda_anonmask_create** and stamps that dot pattern onto a copy of a PDF. It prints the offset, dot radius, and scale it used, then writes **masked.pdf** in the working directory. Print that file with a zero page margin, the same margin used for the calibration page.

Pages that contain white or light areas inside images need the **Wand** Python package, which binds to ImageMagick. Without it, those areas are left unmasked. The rest of the page is still processed.

# CAVEATS

The output path is always **masked.pdf** in the current directory. A file of that name is overwritten. The input PDF is not changed.

Alignment depends on the printer using the same margin as the calibration print. **--xoffset**, **--yoffset**, and **--dotradius** are the adjustments when the grid does not cover the printer's own dots. A mask built with **deda_anonmask_create --copy** reproduces a pattern instead of hiding one.

Yellow dots on a finished print are hard to see. **--debug** is the way to confirm placement before using yellow.

# HISTORY

**deda_anonmask_apply** is part of **DEDA**, written by **Timo Richter** and **Stephan Escher** and described in their **2018** paper on forensic analysis and anonymisation of printed documents.

# SEE ALSO

[deda_anonmask_create](/man/deda_anonmask_create)(1), [deda_create_dots](/man/deda_create_dots)(1), [deda_clean_document](/man/deda_clean_document)(1), [deda_parse_print](/man/deda_parse_print)(1)

# RESOURCES

```[Source code](https://github.com/dfd-tud/deda)```

<!-- verified: 2026-10-06 -->
