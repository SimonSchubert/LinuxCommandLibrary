# TLDR

**Compare versions of package**

```npm diff --diff=[package]@[1.0.0] --diff=[package]@[2.0.0]```

**Compare local with registry**

```npm diff --diff=[package-name]```

**Compare specific files**

```npm diff --diff=[pkg]@[1.0.0] --diff=[pkg]@[2.0.0] [./file.js]```

# SYNOPSIS

**npm** **diff** [_options_] [_paths_...]

# PARAMETERS

**--diff** _spec_
> Package spec to compare.

**--diff-name-only**
> Show only changed filenames.

**--diff-unified** _n_
> Lines of context.

# DESCRIPTION

**npm diff** shows differences between package versions or between local package and registry. Useful for reviewing changes before updating.

# SEE ALSO

[npm](/man/npm)(1), [npm-outdated](/man/npm-outdated)(1)

