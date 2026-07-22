# TAGLINE

Command-line editor for HCL2 configuration files

# TLDR

**Get an attribute** value from stdin HCL

```cat [file.hcl] | hcledit attribute get [resource.foo.bar.attr]```

**Set an attribute** (print result)

```cat [file.hcl] | hcledit attribute set [resource.foo.bar.attr] '["val"]'```

**Update file in place**

```hcledit attribute set [resource.foo.bar.attr] '["val"]' -f [file.hcl] -u```

**Remove an attribute**

```cat [file.hcl] | hcledit attribute rm [resource.foo.bar.attr]```

**List blocks**

```cat [file.hcl] | hcledit block list```

**Get a block**

```cat [file.hcl] | hcledit block get [resource.foo.bar]```

**Format HCL**

```hcledit fmt -f [file.hcl] -u```

# SYNOPSIS

**hcledit** [*global-flags*] *command*

# DESCRIPTION

**hcledit** is a schemaless command-line editor for **HCL2**. It reads HCL from stdin (or **-f**), applies token-based edits that preserve comments, and writes the result to stdout (or updates in place with **-u**). It was built for Terraform-style refactoring but works for any HCL2 file without needing the target application binary.

Operations cover attributes (**get**, **set**, **append**, **rm**, **mv**, **replace**), blocks (**list**, **get**, **append**, **new**, **rm**, **mv**), body extraction, and **fmt**.

Install via Homebrew, release binaries, or **make install** from source.

# PARAMETERS

**attribute** get|set|append|rm|mv|replace ...

> Read or modify attributes by dotted address (for example **resource.foo.bar.nested.attr**).

**block** list|get|append|new|rm|mv ...

> Inspect or reshape blocks and labels.

**body** get

> Extract body content.

**fmt**

> Format HCL.

**-f**, **--file** *path*

> Input file (default **-** stdin).

**-u**, **--update**

> Write changes back to the file in place.

# CAVEATS

HCL2 only (not HCL1). Schemaless parsing can be looser than application validation; always review diffs and run **terraform validate** (or equivalent) after bulk edits. Quote string values carefully when setting attributes from the shell.

# INSTALL

```brew: brew install hcledit```

```nix: nix profile install nixpkgs#hcledit```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[terraform](/man/terraform)(1), [hclfmt](/man/hclfmt)(1), [jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/minamijoyo/hcledit)```

<!-- verified: 2026-07-19 -->
