# TAGLINE

TUI for generating one-time passwords

# TLDR

**Launch the OTP generator**

```otti```

# SYNOPSIS

**otti** [_options_]

# DESCRIPTION

**otti** is a terminal user interface for generating one-time passwords (OTPs). It provides a quick and reliable way to generate TOTP codes for two-factor authentication directly from the terminal, useful for users who frequently authenticate across multiple platforms.

# CAVEATS

OTP secrets must be manually configured. Time synchronization is required for accurate TOTP generation.

# HISTORY

**otti** was created by **dnaka91** and is written in **Rust**. It supports macOS, Linux, BSD, and Windows.

# SEE ALSO

[pass-otp](/man/pass-otp)(1), [oathtool](/man/oathtool)(1)
