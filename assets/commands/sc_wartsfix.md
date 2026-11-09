# TAGLINE

Truncate damaged scamper warts files

# TLDR

**Repair a damaged warts file**, creating [input.warts].fix

```sc_wartsfix [input.warts]```

**Repair several files** at once

```sc_wartsfix [file1.warts] [file2.warts]```

**Inspect the repaired copy**

```sc_wartsdump [input.warts].fix```

# SYNOPSIS

**sc_wartsfix** [_file_ ...]

# DESCRIPTION

**sc_wartsfix** truncates a **warts** file at the last intact record. For each input file it creates a copy with a **.fix** suffix, leaving the original untouched. This is useful when a file was damaged, for example by disk corruption or an interrupted scamper data collection.

The tool is part of the **scamper** Internet measurement toolkit.

# CAVEATS

Every record after the first damaged one is discarded, even if later records are intact. The output should be verified with sc_wartsdump.

# SEE ALSO

[sc_wartscat](/man/sc_wartscat)(1), [sc_wartsdump](/man/sc_wartsdump)(1), [sc_warts2json](/man/sc_warts2json)(1), [scamper](/man/scamper)(1)

# RESOURCES

```[Homepage](https://www.caida.org/catalog/software/scamper/)```

```[Documentation](https://www.caida.org/catalog/software/scamper/man/sc_wartsfix.1.pdf)```

<!-- verified: 2026-11-09 -->
