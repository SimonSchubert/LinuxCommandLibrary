# TAGLINE

Retrieve raw EDID from a monitor via DDC

# TLDR

**Fetch** raw EDID from the first found monitor (requires root)

```sudo get-edid```

**Fetch** EDID and **parse** it into an xorg.conf-style monitor section

```sudo get-edid | parse-edid```

**Save** raw EDID to a file

```sudo get-edid > monitor.bin```

**Scan only** a specific I2C bus

```sudo get-edid --bus 5 > monitor.bin```

**Use only** the modern I2C interface

```sudo get-edid --i2conly | parse-edid```

**Use only** the older VBE/real-mode interface

```sudo get-edid --classiconly | parse-edid```

**Quiet** mode (no progress messages on stderr)

```sudo get-edid -q > monitor.bin```

# SYNOPSIS

**get-edid** [_OPTIONS_]

# DESCRIPTION

**get-edid** is part of the **read-edid** toolkit. It retrieves the raw Extended Display Identification Data (EDID) block from a connected monitor using the VESA Data Display Channel (DDC). It can talk to the display through Linux I2C (Enhanced DDC) or, on supported builds, through real-mode VBE DDC calls.

The program writes the binary EDID to standard output. Companion tool **parse-edid** reads that binary stream and prints a human-readable summary plus an **xorg.conf**-compatible Monitor section (modelines usable with **xrandr**). The usual workflow is to pipe the two together: **get-edid | parse-edid**.

On modern systems, reading **/sys/class/drm/\*/edid** and decoding with **edid-decode** is often simpler and does not require root; **get-edid** remains useful when sysfs EDID is missing or when configuring displays from a lower-level DDC path.

# PARAMETERS

**-b** _BUS_, **--bus** _BUS_
> Only scan I2C bus number _BUS_ (when built with i2c support).

**-c**, **--classiconly**
> Use only the older VBE interface (when both i2c and VBE are available).

**-h**, **--help**
> Display a short help message and list build-supported options.

**-i**, **--i2conly**
> Use only the I2C interface (when both i2c and VBE are available).

**-m** _NUM_, **--monitor** _NUM_
> Request information for monitor number _NUM_ (VBE interface only).

**-q**, **--quiet**
> Suppress status messages on standard error.

# CAVEATS

Usually needs root (or CAP_SYS_RAWIO / access to the relevant **/dev/i2c-*** devices). Not all video cards and monitors implement DDC reliably; some combinations return partial or empty data. Multi-monitor setups may require **--bus** or **--monitor** to select the right display. Prefer **edid-decode** on **/sys/class/drm/\*/edid** when kernel DRM exposes EDID for the connector.

# HISTORY

**read-edid** was originally written by **John Fremlin**. From version 1.4.2, **Matthew Kern** became maintainer and largely rewrote the tools for 3.0.0, adding I2C support and the current option set. Homepage: **http://www.polypux.org/projects/read-edid/**.

# INSTALL

```apt: sudo apt install read-edid```

```pacman: sudo pacman -S read-edid```

```nix: nix profile install nixpkgs#read-edid```

<!-- packages: 2026-08-12 -->

# SEE ALSO

[edid-decode](/man/edid-decode)(1), [xrandr](/man/xrandr)(1), [xorg](/man/Xorg)(1)

# RESOURCES

```[Homepage](http://www.polypux.org/projects/read-edid/)```

<!-- verified: 2026-08-12 -->
