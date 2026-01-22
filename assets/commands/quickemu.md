# TLDR

**Run** VM from config file

```quickemu --vm [file.conf]```

Run without **committing changes**

```quickemu --status-quo --vm [file.conf]```

Run in **fullscreen** with display backend

```quickemu --fullscreen --display [sdl] --vm [file.conf]```

Create/restore/delete **snapshot**

```quickemu --snapshot [create|apply|delete] [tag] --vm [file.conf]```

List **snapshots**

```quickemu --snapshot info --vm [file.conf]```

**Delete** VM

```quickemu --delete-vm --vm [file.conf]```

# SYNOPSIS

**quickemu** [**--vm** _config_] [**--display** _backend_] [**--snapshot** _action_] [_options_]

# PARAMETERS

**--vm _config_**
> VM configuration file

**--status-quo**
> Don't commit changes to disk

**--fullscreen**
> Start in fullscreen mode

**--display _backend_**
> Display: sdl, gtk, spice, spice-app, none

**--sound-card _card_**
> Audio: intel-hda, ac97, es1370, sb16, none

**--snapshot _action_ _tag_**
> Snapshot operations: create, apply, delete, info

**--delete-vm**
> Delete VM and configuration

**--delete-disk**
> Delete disk image and EFI vars

**--shortcut**
> Create desktop shortcut

# DESCRIPTION

**quickemu** creates and manages optimized QEMU virtual machines with minimal configuration. It automatically configures display, audio, USB passthrough, and shared folders based on the guest OS.

VMs are defined in simple configuration files that specify the OS type and disk image. The tool handles the complex QEMU command-line options internally.

# CAVEATS

Requires QEMU and related packages. Some features need KVM support. Guest additions may be needed for optimal integration. macOS guests have specific requirements.

# HISTORY

**quickemu** was created by **Martin Wimpress** to simplify QEMU VM management. It grew from scripts used to test Linux distributions and evolved into a comprehensive VM tool.

# SEE ALSO

[quickget](/man/quickget)(1), [qemu](/man/qemu)(1), [virt-manager](/man/virt-manager)(1)
