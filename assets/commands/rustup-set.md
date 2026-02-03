# TLDR

**Set default host**

```rustup set default-host [x86_64-unknown-linux-gnu]```

**Set profile**

```rustup set profile minimal```

**Enable auto-self-update**

```rustup set auto-self-update enable```

# SYNOPSIS

**rustup** **set** _setting_ _value_

# PARAMETERS

**default-host** _triple_
> Default host triple.

**profile** _name_
> Default installation profile.

**auto-self-update** _mode_
> Auto-update rustup (enable/disable/check-only).

# DESCRIPTION

**rustup set** configures rustup settings. Sets defaults for new installations and update behavior. Profiles control which components are installed by default.

# SEE ALSO

[rustup](/man/rustup)(1), [rustup-show](/man/rustup-show)(1)

