# TAGLINE

flash drive capacity tester

# TLDR

**Fill a mounted flash drive** with test files

```f3write [/media/flash_drive]```

**Write test files starting** from a specific file number

```f3write --start-at=[10] [/media/flash_drive]```

**Write test files up to** a specific file number

```f3write --end-at=[50] [/media/flash_drive]```

**Write to a raw device** (unmounted)

```sudo f3write -g [/dev/sdX]```

**Force write even if** device appears busy

```f3write --force [/media/flash_drive]```

**Optimize for low memory** systems

```f3write --low-memory [/media/flash_drive]```

# SYNOPSIS

**f3write** [**--start-at**=_NUM_] [**--end-at**=_NUM_] _PATH_

# PARAMETERS

**--start-at**=_NUM_
> Initial number for file names (default: 1).

**--end-at**=_NUM_
> Final number for file names (default: infinity).

**-a**, **--append**
> Append new files to existing ones on the target device.

**-b** _BYTES_, **--block-size**=_BYTES_
> Set I/O block size in bytes (default: 1M).

**-f**, **--force**
> Force writing even if device appears busy or contains data.

**-g**, **--full-device**
> Write to the full raw device (device must be unmounted).

**-L**, **--low-memory**
> Optimize operation for systems with limited memory.

**-s** _OFFSET_, **--start-offset**=_OFFSET_
> Starting offset in bytes from device beginning.

**-S** _OFFSET_, **--end-offset**=_OFFSET_
> Ending offset in bytes where writing should stop.

# DESCRIPTION

**f3write** is part of the F3 (Fight Flash Fraud) suite and tests the actual capacity of flash storage devices by filling them with known data patterns. It writes 1GB files named N.h2w (where N is a number) to the target filesystem until the drive is full.

The typical workflow involves writing test data with f3write, then verifying with **f3read**. If the drive is counterfeit and reports false capacity, f3read will detect data corruption beyond the actual physical capacity.

f3write can operate on a mounted filesystem (writing to a directory) or directly to a raw unmounted device using the **-g** option.

# CAVEATS

**All data on the tested disk will be overwritten.** Always backup important data before testing. When using raw device mode (-g), ensure you specify the correct device to avoid destroying data on other drives. The test can take considerable time depending on drive size and speed.

# HISTORY

f3write was created by Michel Machado as part of the F3 (Fight Flash Fraud) suite. The tool addresses the widespread problem of counterfeit flash storage that uses modified firmware to report inflated capacities. When users attempt to store more data than the actual capacity, the drive silently corrupts data by overwriting existing content or simply discarding writes.

# SEE ALSO

[f3read](/man/f3read)(1), [f3probe](/man/f3probe)(1), [f3fix](/man/f3fix)(1), [dd](/man/dd)(1)
