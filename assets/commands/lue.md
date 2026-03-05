# TAGLINE

Terminal eBook reader with text-to-speech

# TLDR

**Read an eBook**

```lue [path/to/book.epub]```

**Start the navigation guide**

```lue --guide```

**Read with a specific keyboard layout**

```lue -k [layout] [path/to/book.epub]```

# SYNOPSIS

**lue** [_options_] [_file_]

# PARAMETERS

**-k**, **--key** _LAYOUT_
> Specify the keyboard layout to use.

**--guide**
> Launch the interactive navigation guide.

# DESCRIPTION

**lue** is a terminal-based eBook reader with audiobook-quality text-to-speech support. It handles multiple formats including **EPUB**, **PDF**, **DOCX**, **HTML**, **RTF**, **TXT**, and **MD**.

The interface offers three UI complexity modes (Minimal, Medium, and Full) that can be cycled through with the **v** key. Two built-in keyboard layouts are available for navigation.

# CAVEATS

Text-to-speech quality depends on the system's TTS engine. PDF rendering in the terminal may not preserve complex layouts.

# HISTORY

**lue** was created by **superstarryeyes** and is written in **Python**. It can be installed via pip with `pip install lue-reader`.

# SEE ALSO

[bat](/man/bat)(1), [less](/man/less)(1)
