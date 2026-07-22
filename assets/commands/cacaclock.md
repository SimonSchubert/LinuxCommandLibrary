# TAGLINE

Display time as ASCII art in the terminal

# TLDR

Display the **time** as ASCII art

```cacaclock```

Change the **font**

```cacaclock -f [font]```

Change the time **format**

```cacaclock -d "[strftime_arguments]"```

# SYNOPSIS

**cacaclock** [_options_]

# DESCRIPTION

**cacaclock** displays the current time as ASCII art in the terminal using the libcaca library. It provides a visually distinctive clock display using text characters.

The display format can be customized using strftime format specifiers.

# PARAMETERS

**-f, --font** _font_
> Use specified font for display

**-d, --dateformat** _format_
> Time format using strftime specifiers (e.g., %H:%M:%S)

# INSTALL

```apt: sudo apt install caca-utils```

```dnf: sudo dnf install caca-utils```

```apk: sudo apk add libcaca-apps```

```zypper: sudo zypper install caca-utils```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[cacademo](/man/cacademo)(1), [cacafire](/man/cacafire)(1), [cacaview](/man/cacaview)(1)

# RESOURCES

```[Source code](https://github.com/cacalabs/libcaca)```

<!-- verified: 2026-06-22 -->
