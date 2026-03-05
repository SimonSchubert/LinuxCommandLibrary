# TAGLINE

Ncurses-based TUI for QEMU virtual machine management

# TLDR

**Launch the VM manager**

```nemu```

# SYNOPSIS

**nemu** [_options_]

# DESCRIPTION

**nemu** is an ncurses-based TUI for managing QEMU virtual machines from the terminal. It provides VM creation, configuration, status monitoring, CPU usage tracking, and connectivity via VNC or SPICE, all without requiring a graphical desktop environment.

Features include support for qcow2 and raw disk image formats, configurable refresh timeouts, and VM preview using the Kitty graphics protocol in supported terminals.

# CAVEATS

Requires QEMU to be installed. Some features like VM preview require a terminal with Kitty graphics protocol support.

# HISTORY

**nemu** is developed by the **nemuTUI** project and is written in **C**.

# SEE ALSO

[qemu](/man/qemu)(1), [virsh](/man/virsh)(1), [virt-manager](/man/virt-manager)(1)
