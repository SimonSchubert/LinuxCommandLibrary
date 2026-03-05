# TAGLINE

Keyboard tester in the terminal

# TLDR

**Launch the keyboard tester**

```kbt```

# SYNOPSIS

**kbt** [_options_]

# DESCRIPTION

**kbt** is a terminal-based keyboard tester that displays a visual keyboard layout and highlights keys as they are pressed. It supports multiple keyboard layouts and provides a reliable alternative to often inconsistent online keyboard testing tools.

The TUI shows a keyboard diagram that lights up in real time as you press keys, making it useful for testing new keyboards, checking for dead keys, or verifying key switches after maintenance.

# CAVEATS

Key detection depends on the terminal emulator's ability to pass through key events. Some key combinations may be intercepted by the OS or terminal before reaching kbt.

# HISTORY

**kbt** was created by **bloznelis** and is written in **Rust**. It was created out of frustration with unreliable online keyboard testers.

# SEE ALSO

[showkey](/man/showkey)(1)
