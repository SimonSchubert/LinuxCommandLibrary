# TAGLINE

Download photos and videos from iCloud Photos

# TLDR

**Download** to a directory

```icloudpd --directory [~/Photos] --username [apple_id]```

**Recent** photos only

```icloudpd --directory [~/Photos] --username [user] --recent [100]```

**List** without downloading

```icloudpd --directory [~/Photos] --username [user] --only-print-filenames```

# SYNOPSIS

**icloudpd** [*options*]

# DESCRIPTION

**icloudpd** (iCloud Photos Downloader) authenticates to Apple iCloud and downloads the photo library to a local folder, with options for recent items, album filters, and skip-existing behavior. Install via PyPI or Docker images from **icloud-photos-downloader/icloud_photos_downloader**.

# PARAMETERS

**--directory** *path*

> Destination folder.

**--username** *apple_id*

> Apple ID email.

**--recent** *n*

> Limit to *n* most recent assets.

**--until-found** *n*

> Stop after *n* consecutive existing files.

MFA/2FA prompts appear interactively when required. See **icloudpd --help** for thread counts and live-photo handling.

# CAVEATS

Apple authentication and MFA flows change; keep the tool updated. Respect account security—prefer app-specific handling where documented. Large libraries need disk space and time.

# SEE ALSO

[rclone](/man/rclone)(1), [gphotos-uploader-cli](/man/gphotos-uploader-cli)(1)

# RESOURCES

```[Source code](https://github.com/icloud-photos-downloader/icloud_photos_downloader)```

<!-- verified: 2026-07-19 -->
