# TAGLINE

Configure rustup settings and defaults

# TLDR

**Set the default host triple**

```rustup set default-host [x86_64-unknown-linux-gnu]```

**Set the installation profile to minimal**

```rustup set profile minimal```

**Set the installation profile to default** (includes rustfmt and clippy)

```rustup set profile default```

**Enable automatic self-updates**

```rustup set auto-self-update enable```

**Disable automatic self-updates**

```rustup set auto-self-update disable```

# SYNOPSIS

**rustup** **set** _setting_ _value_

# SUBCOMMANDS

**default-host** _triple_
> Set the default host triple for toolchain installations (e.g., x86_64-unknown-linux-gnu).

**profile** _name_
> Set the default component installation profile. **minimal** includes only rustc, rust-std, and cargo. **default** adds rust-docs, rustfmt, and clippy. **complete** installs all available components.

**auto-self-update** _mode_
> Control rustup's automatic self-update behavior: **enable**, **disable**, or **check-only**.

# DESCRIPTION

**rustup set** configures rustup settings that affect default behavior for new toolchain installations and updates. The profile setting controls which components are installed by default, and the auto-self-update setting controls whether rustup updates itself when running `rustup update`.

# SEE ALSO

[rustup](/man/rustup)(1), [rustup-show](/man/rustup-show)(1)

