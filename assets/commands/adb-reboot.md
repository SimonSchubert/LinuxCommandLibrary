# TLDR

**Reboot** the device normally

```adb reboot```

Reboot into **bootloader/fastboot** mode

```adb reboot bootloader```

Reboot into **recovery** mode

```adb reboot recovery```

Reboot into **sideload** mode

```adb reboot sideload```

# SYNOPSIS

**adb reboot** [_bootloader_|_recovery_|_sideload_|_sideload-auto-reboot_]

# DESCRIPTION

**adb reboot** restarts the connected Android device. Without arguments, it performs a normal reboot. With mode arguments, it can reboot into special modes like bootloader (fastboot), recovery, or sideload for flashing firmware or installing updates.

# PARAMETERS

**bootloader**
> Reboot into bootloader/fastboot mode for low-level flashing

**recovery**
> Reboot into recovery mode for system recovery or updates

**sideload**
> Reboot into sideload mode for ADB sideloading

**sideload-auto-reboot**
> Reboot into sideload mode and automatically reboot after sideload completes

# CAVEATS

Bootloader and recovery modes may require unlocked bootloader or specific device states. Some devices use vendor-specific boot modes. Rebooting to bootloader terminates the adb connection; use **fastboot** commands afterward.

# HISTORY

**adb reboot** has been available since the initial Android SDK release in **2008**. Boot mode options were added to facilitate ROM development and device recovery operations.

# SEE ALSO

[adb](/man/adb)(1), [fastboot](/man/fastboot)(1)
