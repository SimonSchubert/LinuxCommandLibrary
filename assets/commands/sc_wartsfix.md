# TAGLINE

Repair corrupted scamper warts files

# TLDR

**Repair a corrupted warts file** and write output to stdout

```sc_wartsfix [input.warts] > [fixed.warts]```

**Repair and pipe** to sc_wartsdump for inspection

```sc_wartsfix [input.warts] | sc_wartsdump```

# SYNOPSIS

**sc_wartsfix** _file_

# DESCRIPTION

**sc_wartsfix** attempts to salvage valid records from truncated or corrupted scamper warts files. It reads the input file, skips over corrupted or incomplete records, and writes recovered valid records to standard output. This is useful when a scamper data collection was interrupted (e.g., process crash, disk full) leaving a partially written warts file.

The tool is part of the **scamper** Internet measurement toolkit.

# CAVEATS

Only recovers structurally intact records; data within a corrupted record is lost. Output should be verified with sc_wartsdump.

# SEE ALSO

[sc_wartscat](/man/sc_wartscat)(1), [sc_wartsdump](/man/sc_wartsdump)(1), [scamper](/man/scamper)(1)

