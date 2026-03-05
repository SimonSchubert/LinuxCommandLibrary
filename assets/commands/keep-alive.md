# TAGLINE

Cross-platform utility to prevent system from sleeping

# TLDR

**Keep the system awake**

```keep-alive```

# SYNOPSIS

**keep-alive** [_options_]

# DESCRIPTION

**keep-alive** is a lightweight, cross-platform utility that prevents your system from sleeping, dimming displays, or pausing background processes. It ensures that downloads, builds, and other long-running tasks remain active without interruption.

The tool works on **Linux**, **macOS**, and **Windows** by simulating activity or using OS-specific APIs to inhibit sleep.

# CAVEATS

May require appropriate permissions depending on the operating system. Does not prevent manual sleep triggered by the user.

# SEE ALSO

[caffeinate](/man/caffeinate)(8)
