# TAGLINE

Display the dependency graph as a tree

# TLDR

**Show dependency tree**

```cargo tree```

**Show inverted tree for package**

```cargo tree --invert [package]```

**Show duplicate dependencies**

```cargo tree --duplicates```

**Show features enabled by dependencies**

```cargo tree --edges features```

**Show without deduplication**

```cargo tree --no-dedupe```

**Show specific package subtree**

```cargo tree -p [package]```

**ASCII output**

```cargo tree --charset ascii```

# SYNOPSIS

**cargo tree** [_options_]

# DESCRIPTION

**cargo tree** displays a tree visualization of the dependency graph for a Rust project. It shows all packages and their transitive dependencies in an indented tree format, with packages marked `(*)` indicating they have already been shown elsewhere and are deduplicated.

The command supports several analysis modes: `--invert` traces which packages depend on a given crate, `--duplicates` shows packages that appear multiple times with different versions, and `--edges features` reveals how features propagate through the dependency graph. Built into Cargo since Rust 1.44, it replaced the earlier `cargo-tree` third-party plugin.

# PARAMETERS

**-i**, **--invert** _spec_
> Invert tree, showing what depends on package

**-p**, **--package** _spec_
> Package to use as tree root

**-e**, **--edges** _kinds_
> Dependency types: normal, dev, build, features, all

**-d**, **--duplicates**
> Show packages built multiple times

**--no-dedupe**
> Don't deduplicate repeated packages

**--depth** _n_
> Maximum display depth

**--prune** _spec_
> Prune packages from display

**--charset** _set_
> Character set: utf8, ascii

**--format** _fmt_
> Format string for package display

**--prefix** _prefix_
> Prefix: indent, depth, none

**--target** _triple_
> Filter for target platform

**--all-features**
> Enable all features

**--features** _features_
> Enable specific features

# OUTPUT SYMBOLS

**(*)** Package already shown elsewhere (deduplicated)

# CAVEATS

Use --invert to trace where a dependency comes from. Combine with --edges features to understand feature propagation.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-metadata](/man/cargo-metadata)(1)
