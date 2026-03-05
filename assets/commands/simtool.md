# TAGLINE

TUI for managing iOS simulators on macOS

# TLDR

**Launch the simulator browser**

```simtool```

**Start with an all-apps view**

```simtool --apps```

**Display available color themes**

```simtool --list-themes```

# SYNOPSIS

**simtool** [**--apps**] [**--generate-config**] [**--list-themes**]

# DESCRIPTION

**simtool** is a terminal user interface for browsing and managing iOS Simulators on macOS. It lets you navigate simulators, browse installed apps, explore file systems, and preview content with syntax highlighting. It features Vim-style navigation, 60+ color themes, SQLite inspection, and lazy loading.

# CAVEATS

macOS only. Requires Xcode with simulator runtimes installed.

# HISTORY

**simtool** was created by **Aziz Uysal** (azizuysal) and is written in **Go**.

# SEE ALSO

[xcrun](/man/xcrun)(1), [ios-deploy](/man/ios-deploy)(1), [idb](/man/idb)(1)
