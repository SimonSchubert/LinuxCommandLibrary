# TAGLINE

Generate Zapier integration boilerplate code

# TLDR

**Scaffold trigger**

```zapier-platform scaffold trigger [noun]```

**Scaffold create action**

```zapier-platform scaffold create [noun]```

**Scaffold search action**

```zapier-platform scaffold search [noun]```

**Scaffold resource**, overwriting existing files

```zapier-platform scaffold resource [noun] --force```

**Scaffold into a custom directory**

```zapier-platform scaffold trigger [noun] --dest=[src/triggers] --entry=[src/index.js]```

# SYNOPSIS

**zapier-platform** **scaffold** _type_ _noun_ [_options_]

# PARAMETERS

_type_
> One of **trigger**, **search**, **create** or **resource**.

_noun_
> What the scaffold acts on, such as **contact** or **deal**.

**-d**, **--dest** _dir_
> Directory for the new file. Defaults to **[triggers|searches|creates]/_noun_**.

**--test-dest** _dir_
> Directory for the new test file. Defaults to **test/[triggers|searches|creates]/_noun_**.

**-e**, **--entry** _path_
> Path to the integration's entry point. Detected automatically if omitted.

**-f**, **--force**
> Overwrite an existing file.

**--no-help**
> Skip adding helpful intro comments.

**--debug**
> Show extra debugging output.

# DESCRIPTION

**zapier-platform scaffold** creates a new file with starter code, such as **triggers/contact.js**, and imports and registers it inside **index.js**.

# CAVEATS

The binary is **zapier-platform**. The old **zapier** name was deprecated in zapier-platform-cli 18.0.0 and removed in 19.0.0.

# SEE ALSO

[zapier](/man/zapier)(1), [zapier-init](/man/zapier-init)(1), [zapier-test](/man/zapier-test)(1)

# RESOURCES

```[Source code](https://github.com/zapier/zapier-platform)```

```[Documentation](https://github.com/zapier/zapier-platform/blob/main/packages/cli/docs/cli.md)```

<!-- verified: 2026-11-09 -->
