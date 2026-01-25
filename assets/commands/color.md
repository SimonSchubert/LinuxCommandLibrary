# TLDR

**Display ANSI colors in terminal**

```for i in {0..255}; do printf "\e[38;5;${i}m%3d " $i; done```

**Set text color** (red)

```echo -e "\e[31mRed text\e[0m"```

**Set background color** (blue)

```echo -e "\e[44mBlue background\e[0m"```

**Bold text**

```echo -e "\e[1mBold text\e[0m"```

**Combine styles**

```echo -e "\e[1;31;44mBold red on blue\e[0m"```

**Reset all formatting**

```echo -e "\e[0m"```

# SYNOPSIS

**echo -e** "\e[_code_m_text_\e[0m"

**printf** "\033[_code_m_text_\033[0m"

# ANSI CODES

**Text Styles:**
**0** - Reset all
**1** - Bold
**2** - Dim
**3** - Italic
**4** - Underline
**5** - Blink
**7** - Reverse
**9** - Strikethrough

**Foreground Colors (30-37):**
**30** Black, **31** Red, **32** Green, **33** Yellow
**34** Blue, **35** Magenta, **36** Cyan, **37** White

**Background Colors (40-47):**
**40** Black, **41** Red, **42** Green, **43** Yellow
**44** Blue, **45** Magenta, **46** Cyan, **47** White

**256 Colors:**
**38;5;N** - Foreground color N (0-255)
**48;5;N** - Background color N (0-255)

**True Color (24-bit):**
**38;2;R;G;B** - Foreground RGB
**48;2;R;G;B** - Background RGB

# DESCRIPTION

Terminal **color** is controlled through ANSI escape sequences, special character codes interpreted by terminal emulators to change text appearance. These sequences start with **ESC** (\\e, \\033, or \\x1b) followed by formatting codes.

Colors enhance readability of command output, differentiate log levels, highlight errors, and improve user interfaces in terminal applications. Most modern terminals support 256 colors and true color (16 million colors).

The **tput** command provides a portable way to generate escape sequences. Environment variables like **TERM** and **NO_COLOR** influence color support detection.

# TOOLS

**tput setaf N**: Set foreground color
**tput setab N**: Set background color
**tput bold**: Bold mode
**tput sgr0**: Reset attributes

# CAVEATS

Not all terminals support all features; 256-color and true color require modern terminals. The **NO_COLOR** environment variable convention requests programs disable color output. Piping colored output to files or other programs may include escape sequences. Test terminal support with **tput colors**.

# HISTORY

ANSI escape sequences were standardized in **ECMA-48** in **1976**, based on earlier work by **ANSI** (American National Standards Institute). The standard allowed portable control of video terminals. Support has been ubiquitous in Unix terminals since the **1980s** and was added to Windows 10 in **2016**. The **NO_COLOR** convention was proposed in **2017** to standardize disabling colors.

# SEE ALSO

[tput](/man/tput)(1), [dircolors](/man/dircolors)(1), [lolcat](/man/lolcat)(1), [terminfo](/man/terminfo)(5)
