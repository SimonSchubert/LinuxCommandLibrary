# TAGLINE

Looks up static HP printer model information from HPLIP's models database

# TLDR

**Query a single key** for a printer by device URI

```hp-query -d [device-uri] -k [key]```

**Query all keys** for a normalized model name (as used in models.dat)

```hp-query -m [model-name] -a```

**Query a key** using the raw model name from the device's MDL: field

```hp-query -r [model-name] -k [key]```

**Query all keys** with a custom separator

```hp-query -m [model-name] -a -s [tab]```

**Suppress the trailing line feed** on output (useful when scripting)

```hp-query -m [model-name] -k [key] -x```

# SYNOPSIS

**hp-query** [_MODE_] [_OPTIONS_]

# PARAMETERS

**-d** _device-uri_, **--device**=_device-uri_
> Specify the model by CUPS device URI.

**-m** _model_, **--model**=_model_
> Specify the normalized model name, as used in HPLIP's models.dat.

**-r** _model_, **--raw**=_model_
> Specify the raw model name, taken from the **MDL:** field of the device's IEEE-1284 device ID.

**-k** _key_, **--key**=_key_
> Key to query (a models.dat field name).

**-a**, **--all**
> Query all keys instead of a single one.

**-s** _sep_, **--sep**=_sep_
> Separator between values when used with **-a**: a literal character, or one of tab, newline, cr, lf, crlf.

**-x**
> Suppress the trailing linefeed on output.

**-n**, **--non-interactive**
> Run without interactive prompts.

**-l** _level_, **--logging**=_level_
> Set logging verbosity: none, info (default), error, warn, or debug.

**-g**
> Run with debug-level logging (equivalent to **-l debug**).

**-h**, **--help**
> Display help and exit.

# DESCRIPTION

**hp-query** looks up static model information for an HP printer from HPLIP's internal models database (models.dat), given a device URI, a normalized HPLIP model name, or a raw **MDL:** string taken from the printer's IEEE-1284 device ID.

It is designed to be called from other programs and installer scripts rather than run interactively, returning one field (**-k**) or all fields (**-a**) about a model: supported data types, required plugins, back-end capabilities, and similar metadata used elsewhere in HPLIP.

# CAVEATS

Part of the HPLIP package. This queries HPLIP's local models database, not the printer directly, so results depend entirely on whether that model is present in models.dat; very new or unlisted models return little or nothing. Resolving a model from **-d** _device-uri_ still requires the device to be reachable long enough to read its device ID.

# HISTORY

**hp-query** is one of the model-lookup utilities in **HPLIP** (HP Linux Imaging and Printing), HP's open-source printer/scanner driver suite for Linux.

# SEE ALSO

[hp-info](/man/hp-info)(1), [hp-setup](/man/hp-setup)(1), [hp-check](/man/hp-check)(1)

# RESOURCES

```[Source code](https://sourceforge.net/projects/hplip/)```

```[Homepage](https://developers.hp.com/hp-linux-imaging-and-printing)```

```[Documentation](https://developers.hp.com/hp-linux-imaging-and-printing/tech_docs/man_pages/index)```

<!-- verified: 2026-07-19 -->
