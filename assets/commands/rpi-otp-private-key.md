# TLDR

Read the **OTP private key**

```rpi-otp-private-key```

# SYNOPSIS

**rpi-otp-private-key**

# DESCRIPTION

**rpi-otp-private-key** displays the One-Time Programmable (OTP) private key stored in the Raspberry Pi hardware. This key is used for secure boot and encryption features.

The OTP memory can only be programmed once, making it suitable for storing permanent device-specific keys.

# CAVEATS

OTP programming is permanent and cannot be undone. The private key should be kept secure and not shared publicly.

# HISTORY

Part of **Raspberry Pi** secure boot infrastructure. Enables hardware-backed security features for advanced deployments.

# SEE ALSO

[rpi-eeprom-update](/man/rpi-eeprom-update)(1), [vcgencmd](/man/vcgencmd)(1)
