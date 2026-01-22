# TLDR

Generate **ASCII art** for text

```toilet [input_text]```

Use custom **font**

```toilet [input_text] -f [font_filename]```

Apply **filter**

```toilet [input_text] -F [filter_name]```

**List** available filters

```toilet -F list```

# SYNOPSIS

**toilet** [_OPTIONS_] [_TEXT_...]

# PARAMETERS

**-f, --font** _NAME_
> Use specified font file

**-F, --filter** _NAME_
> Apply filter to output

**-w, --width** _N_
> Set output width

**-t, --term**
> Use terminal width

**-d, --directory** _DIR_
> Specify font directory

# DESCRIPTION

**toilet** (The Other Implementation's letters) displays ASCII-art text banners using various fonts and filters. It is similar to FIGlet but with additional features like color filters and Unicode support.

The program reads text from command-line arguments or standard input and renders it using the specified font. Various filters can apply effects like color gradients, borders, and transformations.

# CAVEATS

Font availability depends on installation. Some filters require terminal color support. Wide output may wrap incorrectly on narrow terminals. Unicode fonts require UTF-8 terminal support.

# HISTORY

**toilet** was created by **Sam Hocevar** as part of the libcaca project, providing an alternative to FIGlet with additional features like color support and more rendering options.

# SEE ALSO

[figlet](/man/figlet)(1), [banner](/man/banner)(1)
