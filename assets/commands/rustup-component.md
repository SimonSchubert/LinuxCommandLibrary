# TLDR

**List available components**

```rustup component list```

**Add component**

```rustup component add [component]```

**Add rust-src**

```rustup component add rust-src```

**Remove component**

```rustup component remove [component]```

# SYNOPSIS

**rustup** **component** _command_ [_options_]

# PARAMETERS

**list**
> List components.

**add** _component_
> Install component.

**remove** _component_
> Uninstall component.

**--toolchain** _name_
> Target toolchain.

# DESCRIPTION

**rustup component** manages Rust toolchain components. Components include rust-src, rustfmt, clippy, and others. Add components for additional development tools.

# SEE ALSO

[rustup](/man/rustup)(1), [rustup-toolchain](/man/rustup-toolchain)(1)

