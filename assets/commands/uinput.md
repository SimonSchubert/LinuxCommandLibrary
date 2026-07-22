# TAGLINE

Virtual input device event writer

# TLDR

**Preview** device description (dry-run)

```uinput -p```

Merge **YAML** device descriptions

```sudo uinput -c [path/to/device1.yaml] [path/to/device2.yaml]```

Merge from **device** nodes

```sudo uinput -d [/dev/input/eventX] [/dev/input/eventY]```

# SYNOPSIS

**uinput** [_OPTIONS_]

# PARAMETERS

**-p**
> Print the merged YAML device description and exit (dry-run preview).

**-c** _FILE..._
> Merge one or more YAML device-description files into the virtual device.

**-d** _DEVICE..._
> Merge capabilities cloned from existing `/dev/input/event*` device nodes.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**uinput** is the writer half of the Interception Tools pipeline: it reads `input_event` records from stdin and dispatches them through a freshly created virtual input device backed by the kernel's `/dev/uinput` interface. The virtual device's capabilities (keys, axes, LEDs, etc.) are derived from the YAML description files passed via `-c`, optionally merged with capabilities cloned from existing devices via `-d`.

Typical usage chains it after **udevmon** and per-device transformation tools (such as **caps2esc**) so that remapped events are re-injected into the input stack as if they came from a normal device.

# CAVEATS

Requires CAP_MKNOD and write access to **/dev/uinput** — usually run as root or via a udev rule that grants the executing user access. Loading the `uinput` kernel module is required (`modprobe uinput`). Misconfigured pipelines can leave the system without keyboard input; have a fallback session ready.

# INSTALL

```apt: sudo apt install interception-tools```

```pacman: sudo pacman -S interception-tools```

```nix: nix profile install nixpkgs#interception-tools```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[udevmon](/man/udevmon)(1)
