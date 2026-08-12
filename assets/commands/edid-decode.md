# TAGLINE

Decode EDID monitor description data

# TLDR

**Decode** EDID from a connected display under DRM

```edid-decode /sys/class/drm/card1-DP-1/edid```

**Decode** EDID from stdin (e.g. from xrandr property dump)

```xrandr --props | edid-decode```

**Check** an EDID for standards compliance and report issues

```edid-decode --check /sys/class/drm/card0-HDMI-A-1/edid```

**Report native resolution** only summary at the end

```edid-decode --native-resolution /sys/class/drm/card1-eDP-1/edid```

**Emit xorg ModeLine** timings for use with xrandr --newmode

```edid-decode --xmodeline /sys/class/drm/card1-DP-1/edid```

**Convert** raw binary EDID to a hex dump file

```edid-decode -o hex monitor.bin monitor.hex```

**Show timings** for a known CTA VIC code without an EDID

```edid-decode --vic 16```

# SYNOPSIS

**edid-decode** [_options_] [_in_ [_out_]]

# DESCRIPTION

**edid-decode** decodes Extended Display Identification Data (EDID) from monitors and displays it in human-readable form. It supports EDID 1.3/1.4, DisplayID 1.3/2.1, HDMI and CTA-861 extension blocks, and related VESA/CTA standards.

If _in_ is omitted or is **-**, the EDID is read from standard input. Input may be raw binary or ASCII text; the tool scans for hex dumps and also recognizes formats from **edid-decode** itself, **xrandr** property output, and **Xorg** log files. On modern Linux systems with kernel modesetting, connected-display EDIDs are available as **/sys/class/drm/\*/edid**.

If _out_ is given, the tool writes the EDID (converted as requested) and skips the decoding step. By default stdout gets a hex dump and a file path gets raw binary. Timing lines are shown in short form (resolution, refresh, pixel clock) with optional long porch/sync detail for detailed timings.

# PARAMETERS

**-h**, **--help**
> Print help message.

**-o**, **--output-format** _fmt_
> When writing _out_, use format _fmt_: **hex** (default for stdout), **raw** (default for files), **carray**, or **xml**.

**-c**, **--check**
> Validate the EDID against known standards; report warnings and failures at the end.

**-C**, **--check-inline**
> Same checks as **--check**, reported as they are found.

**-n**, **--native-resolution**
> Report the native resolution at the end (may differ across Block 0, CTA, and DisplayID blocks).

**-p**, **--preferred-timings**
> Report preferred timings at the end.

**--diagonal** _inches_
> Assume a display diagonal of _inches_ for image-size consistency checks (square pixels).

**-P**, **--physical-address**
> Print only the HDMI CEC Source Physical Address (or f.f.f.f if missing/unparseable). Useful with **cec-ctl**.

**-S**, **--short-timings**
> Show all video timings in short format.

**-L**, **--long-timings**
> Show all video timings in long format (porch/sync detail).

**-N**, **--ntsc**
> Prefer NTSC-style rates (e.g. 29.97 Hz instead of 30) for multiples of 6 Hz.

**-X**, **--xmodeline**
> Format long timings as **xorg.conf** ModeLine strings for **xrandr --newmode**.

**-F**, **--fbmode**
> Format long timings as **fb.modes** video modes.

**-V**, **--v4l2-timings**
> Format long timings for V4L2 **VIDIOC_S_DV_TIMINGS**.

**-s**, **--skip-hex-dump**
> Omit the initial hex dump of the EDID.

**-H**, **--only-hex-dump**
> Print only the hex dump and exit.

**--skip-sha**
> Do not print the git SHA of the edid-decode build in the output.

**--hide-serial-numbers**
> Replace serial numbers in the human-readable section with "...".

**--version**
> Show build SHA and last commit date.

**--vic** _n_, **--dmt** _id_, **--hdmi-vic** _n_, **--cvt** ..., **--gtf** ..., **--ovt** ...
> Timing calculators/lookups (no EDID decode required for most of these). See the full man page for argument forms.

**--list-established-timings**, **--list-dmts**, **--list-vics**, **--list-hdmi-vics**, **--list-rids**
> List known timing tables.

# CAVEATS

Not every EDID field is fully decoded. Standards validation is best-effort and may not match every standards-body interpretation. Output format is not stable across versions. Prefer reading **/sys/class/drm/\*/edid** over legacy BIOS/VBE methods when kernel modesetting is available. Serial numbers remain visible in the hex dump even with **--hide-serial-numbers**.

# HISTORY

**edid-decode** was originally written by **Adam Jackson**, with later contributions from Eric Anholt, Damien Lespiau, Hans Verkuil, and others. Maintenance and the primary repository moved to the LinuxTV project under **git.linuxtv.org**.

# INSTALL

```apt: sudo apt install edid-decode```

```dnf: sudo dnf install v4l-utils```

```pacman: sudo pacman -S v4l-utils```

```apk: sudo apk add v4l-utils```

```zypper: sudo zypper install edid-decode```

```nix: nix profile install nixpkgs#v4l-utils```

<!-- packages: 2026-08-12 -->

# SEE ALSO

[get-edid](/man/get-edid)(1), [xrandr](/man/xrandr)(1), [xorg](/man/Xorg)(1), [cec-ctl](/man/cec-ctl)(1)

# RESOURCES

```[Source code](https://git.linuxtv.org/edid-decode.git)```

<!-- verified: 2026-08-12 -->
