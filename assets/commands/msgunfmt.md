# TLDR

**Convert MO to PO**

```msgunfmt [messages.mo] -o [messages.po]```

**Convert Java properties**

```msgunfmt --java -d [classes/] -l [locale] -o [output.po]```

**Specify output encoding**

```msgunfmt --output-encoding=[UTF-8] [messages.mo] -o [messages.po]```

# SYNOPSIS

**msgunfmt** [_options_] _inputfile_

# PARAMETERS

**-o** _file_
> Output file.

**--java**
> Java ResourceBundle mode.

**-d** _dir_
> Class directory for Java.

**-l** _locale_
> Locale for Java mode.

**--output-encoding** _enc_
> Output character encoding.

# DESCRIPTION

**msgunfmt** converts compiled gettext MO (machine object) files back to human-readable PO (portable object) format. Also extracts translations from Java ResourceBundle classes. Part of GNU gettext.

# SEE ALSO

[msgfmt](/man/msgfmt)(1), [msgcat](/man/msgcat)(1), [msgattrib](/man/msgattrib)(1)

