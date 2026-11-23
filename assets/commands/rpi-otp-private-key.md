# TAGLINE

Read or write a private key in Raspberry Pi OTP memory

# TLDR

**Read the device private key** as hex

```sudo rpi-otp-private-key```

**Check whether a key is set** (exit status 1 if all zeros)

```sudo rpi-otp-private-key -c```

**Generate a P-256 key** and extract the raw private component

```openssl ecparam -name prime256v1 -genkey -noout -out [private_key.pem] && openssl ec -in [private_key.pem] -text -noout | awk '/priv:/{f=1;next} /pub:/{f=0} f' | tr -d ' \n:' > [d.hex]```

**Write a key** to OTP (irreversible!)

```sudo rpi-otp-private-key -w $(cat [d.hex])```

**Write without the confirmation prompt**

```sudo rpi-otp-private-key -y -w [64_hex_digits]```

**Output the key in binary** format

```sudo rpi-otp-private-key -b > [key.bin]```

# SYNOPSIS

**rpi-otp-private-key** [**-bcfy**] [**-l** _words_] [**-o** _offset_] [**-w** _key_]

# PARAMETERS

**-w** _key_
> Write _key_ (usually a 64-digit hex number, 256 bits) to OTP memory. Permanent.

**-c**
> Read the key and exit with status 1 if it is all zeros (not set), 0 otherwise.

**-b**
> Output the key in binary format instead of hex.

**-f**
> Force write if the OTP is already non-zero. The firmware only accepts it if the new key equals the bitwise OR of the current OTP value and the new key, since OTP bits can never change from 1 to 0.

**-y**
> Skip the confirmation prompt when writing to OTP.

**-l** _words_
> Key length in 32-bit words. Defaults to 8 (32 bytes); Raspberry Pi 5 supports up to 16 (64 bytes).

**-o** _offset_
> Word offset into the keystore, e.g. 0-7 on Pi 4, 0-15 on Pi 5. Defaults to 0.

**-h**
> Display usage information.

# DESCRIPTION

**rpi-otp-private-key** reads or writes the device-unique private key stored in the One-Time Programmable (OTP) memory of a Raspberry Pi 4 or Raspberry Pi 5 class SoC. The firmware cryptography services expect this to be the raw private component (_d_) of an **ECDSA P-256** key, and it can be used for device identity and signing in secure-boot and provisioning workflows.

With no arguments it prints the current key as a hex string (all zeros if it has not been programmed). These values are not visible through **vcgencmd otp_dump**. When writing, it asks you to type **YES** before burning the key unless **-y** is given.

# CAVEATS

OTP programming is **irreversible**: once burned, bits cannot be cleared. Save the private key in a secure, off-device location before writing. Raspberry Pi 5 and earlier revisions have no hardware secure key store, so the raw OTP value is readable by any process with root privileges, unless newer firmware blocks the mailbox read API via **lock_device_private_key=1** in config.txt (tamper-proof only when secure boot is enabled). Requires root because it uses the VideoCore mailbox interface (**vcmailbox**).

# HISTORY

Part of the **rpi-eeprom** project maintained by Raspberry Pi Ltd, shipped with Raspberry Pi OS alongside the bootloader EEPROM tools. It was introduced with the customer OTP private key support for the Raspberry Pi 4 bootloader and extended for the Raspberry Pi 5.

# SEE ALSO

[rpi-eeprom-update](/man/rpi-eeprom-update)(1), [vcgencmd](/man/vcgencmd)(1)

# RESOURCES

```[Source code](https://github.com/raspberrypi/rpi-eeprom)```

<!-- verified: 2026-11-23 -->
