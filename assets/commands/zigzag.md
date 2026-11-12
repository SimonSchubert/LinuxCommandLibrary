# TAGLINE

Convert SVG artwork to machine embroidery files

# TLDR

**Convert** an SVG to PES and a PNG preview

```zigzag convert [design.svg] -o [design.pes] -o [preview.png]```

Convert a **traced logo** to DST

```zigzag convert [logo.png] -o [logo.dst]```

Print **stitch stats** and checks

```zigzag info [design.svg]```

Use a **fabric** preset

```zigzag convert [design.svg] -o [design.pes] --fabric [knit]```

**List** fabric presets

```zigzag fabrics```

Show **Skitch** machine info over Bluetooth (needs `ble` feature)

```zigzag skitch info```

**Upload** a design to a Skitch

```zigzag skitch send [design.svg]```

# SYNOPSIS

**zigzag** **convert**|_info_|_fabrics_|_skitch_|_capture_ [_options_]

# PARAMETERS

**convert** _input_ **-o** _output_... [_--hoop_ _mm_] [_--fabric_ _id_] [_--hat_] [_--keep-overlaps_]
> Convert SVG (or PNG/JPEG, traced first). Each **-o** extension selects a format: pes, dst, exp, jef, vp3, pec, pen (Skitch stream), svg or png (preview), html (worksheet). **--hoop** draws a square hoop in previews (default 100 mm).

**info** _input_ [_--fabric_] [_--hat_] [_--keep-overlaps_]
> Print size, stitch count, colors, trims, and digitizing checks.

**fabrics**
> List fabric presets.

**skitch** **info**|**status**|**settings**|**send** [_--name_ _substr_] [_--scan_ _seconds_]
> Talk to a Brother Skitch (PP1) over Bluetooth. **send** converts an SVG and uploads it; **--trace** traces the outline after upload, **--sew** starts sewing. Needs a build with the `ble` feature.

**capture** _file_ [_--all_] [_--raw_]
> List Skitch Bluetooth traffic from an iPhone PacketLogger `.pklg` or Android `btsnoop_hci.log`.

# DESCRIPTION

**zigzag** is the command-line tool for ZigZag, an embroidery pipeline written in Rust. It turns SVG paths (fills, strokes, text) into tatami fill, satin, running stitch, and other stitch types, then writes machine files.

The planner can remove hidden fill under later objects (keeping 0.5 mm overlap), order caps center-out or bottom-up, route travel stitches inside shapes, and run checks (narrow fills, wide satins, small lettering, hoop fit). Fabric presets include standard, thin cotton cap, structured cap, and knit.

`cargo build --release` builds the CLI with no GUI system libraries. The studio editor is **zigzag-studio** (`gui` feature). **zigzag-mcp** is a stdio to HTTP bridge for MCP clients.

# CAVEATS

Official downloads are macOS and Windows studio builds; the CLI builds on Linux from source. **skitch** commands fail unless the binary was built with **ble**. Output format is the file extension; an unknown extension is an error. Design size is checked against the Skitch sewing area before upload.

# SEE ALSO

[cargo](/man/cargo)(1)

# RESOURCES

```[Homepage](https://zigzag.diy)```

```[Source code](https://github.com/simpsoka/zigzag)```

<!-- verified: 2026-11-12 -->
