# TAGLINE

Self-hosted video library server in one Go binary

# TLDR

**Start** the server (local web UI on port 8081)

```tiny-tube```

Keep videos in a **chosen directory**

```VIDEO_DIR=[/srv/videos] tiny-tube```

Listen on **every IPv4 interface**

```HOST=[0.0.0.0] PORT=[8081] tiny-tube```

Set the **full bind address** in one variable

```ADDR=[0.0.0.0:8081] tiny-tube```

Point at a **specific FFmpeg** for HLS and posters

```FFMPEG_BIN=[/usr/bin/ffmpeg] tiny-tube```

Check that the process is **up**

```curl -s [http://127.0.0.1:8081]/healthz```

Check that storage and metadata are **usable**

```curl -s [http://127.0.0.1:8081]/readyz```

# SYNOPSIS

**tiny-tube**

# DESCRIPTION

**tiny-tube** is the Tiny Tube server. It serves a video library for training clips, presentations, and recorded meetings: an embedded web interface, SQLite metadata, and video files on disk. Release archives also include **tiny-tube-cli** for user roles and API keys. The process has no command-line flags. Address, storage, the first administrator, LDAP, upload limits, and FFmpeg come from the environment and from a `.env` file in the working directory. Explicit environment variables win, including empty values.

On a new install, copy `.env.example` to `.env` and set **ADMIN_PASS** before the first start. When the user table is empty, startup creates one administrator (default name `admin`). The password must be set and must be something other than `changeme`. Later edits to **ADMIN_USER** or **ADMIN_PASS** leave existing accounts alone. Changing users after that is done at `/admin`, or for roles and API keys with **tiny-tube-cli**.

Open `http://127.0.0.1:8081` on the same machine. The library starts empty. Editors upload and edit. Administrators also delete videos and manage users. Viewers can sign in with a lesser role. Public videos stay in the library. An administrator can put a video on a locked list; only someone with that list's secret link, or an editor or administrator, can see it. The interface is English and Greek. Stop the process with Ctrl+C or SIGTERM. Shutdown waits up to 30 seconds, cancels an in-flight FFmpeg job, and requeues it.

Originals are stored under **VIDEO_DIR** (default `videos`, relative to the working directory) as `original` plus `.mp4`, `.mov`, `.mkv`, or `.webm`. With FFmpeg on `PATH`, or **FFMPEG_BIN** set to an executable that provides libx264 and AAC, a worker builds one 720p HLS rendition (about six seconds per segment) and a JPEG poster. Without FFmpeg, the original plays in browsers that support it. Metadata defaults to SQLite in WAL mode at **DB_PATH**, or at `tiny-tube.db` inside the video directory. `STORE=fs` keeps the older per-video JSON metadata. Run one server process per video directory.

`GET /healthz` reports liveness. `GET /readyz` checks that storage is writable and metadata is readable, and returns 503 when either check fails. Uploads, edits, and deletes also have a JSON API. A script logs in with `POST /api/login` and reuses the session cookie, or sends `Authorization: Bearer` with a key created in `/admin` or by **tiny-tube-cli**.

# CONFIGURATION

```VIDEO_DIR```
> Directory for originals, HLS, posters, and the default database. Default `videos`. Relative paths use the working directory.

```ADDR```
> Full `host:port` listen address. When set, it overrides **HOST** and **PORT**. Must be a host and a port.

```HOST```
> Bind host when **ADDR** is unset. Default `127.0.0.1`. Use `0.0.0.0` for IPv4 access from other machines.

```PORT```
> TCP port when **ADDR** is unset. Default `8081`. Must be 1-65535. `8080` is accepted.

```STORE```
> `sqlite` (default) or `fs`.

```DB_PATH```
> SQLite file. Default is `tiny-tube.db` inside **VIDEO_DIR**. Relative paths use the working directory.

```ADMIN_USER```
> Name of the first administrator, created only when no users exist. Default `admin`.

```ADMIN_PASS```
> Password for that first account. Startup refuses an empty password or `changeme` while the user table is empty.

```AUTH_MODE```
> `local` (default), `ldap`, or `both`. In `both`, existing local accounts use their local password. Other names go to LDAP. LDAP does not take over a same-named local account.

```COOKIE_SECURE```
> `true` marks the session cookie Secure. Use that behind HTTPS. Default `false`.

```FFMPEG_BIN```
> FFmpeg executable. An explicit path that does not work prevents startup. When unset, FFmpeg is taken from `PATH` if present.

```MAX_UPLOAD_BYTES```
> Maximum size of a whole multipart upload, including form fields. Default 2147483648 (2 GiB). Must be a positive integer.

```TRANSCODE_WORKERS```
> Concurrent FFmpeg processes, from 1 to 16. Default 1.

```AUTH_REQUESTS_PER_MINUTE```
> Protected-route requests per source IP per minute, before authentication. Default 60. Range 1-3600. Extra requests get HTTP 429.

```UPLOAD_TIMEOUT_SECONDS```
> Deadline for an authenticated multipart upload. Default 1800. Range 1-86400.

```TRANSCODE_TIMEOUT_SECONDS```
> Deadline for one HLS and poster job. Default 1800. Range 1-86400. An expired job is marked failed and the original is kept.

```LDAP_ADDR```
> Directory URL. Default `ldap://localhost:389`. `ldaps://` is accepted.

```LDAP_BASE_DN```
> Fallback search base and the default used in a direct bind. Default `dc=example,dc=com`.

```LDAP_BIND_DN```
> Service account for a subtree search. When unset, users bind directly.

```LDAP_BIND_PASSWORD```
> Password for that service account.

```LDAP_SEARCH_BASES```
> Semicolon-separated search bases. Setting this turns on subtree search.

```LDAP_USER_FILTER```
> Search filter. `%s` is the escaped username. Default `(uid=%s)`.

```LDAP_USER_DN```
> Direct-bind DN template. Default is `uid=%s` plus the base DN.

```LDAP_ATTR_EMAIL```
> Directory attribute stored as the user's email. Default `mail`.

```LDAP_ATTR_FIRST_NAME```
> Directory attribute for the given name. Default `givenName`.

```LDAP_ATTR_LAST_NAME```
> Directory attribute for the surname. Default `sn`.

```LDAP_ALWAYS_UPDATE```
> When `true` (default), each LDAP login refreshes the local user record from the directory.

# CAVEATS

The default address accepts connections from this computer only. The Go process speaks HTTP. For a network, set the bind address, terminate TLS in front (a sample Nginx config is in the release), and set **COOKIE_SECURE**. The auth limiter uses the socket address and ignores forwarding headers, so every client behind one proxy shares one limit unless the proxy applies its own.

One **tiny-tube** process per video directory. A second server on the same files is unsupported. The release does not include a systemd unit, backups, or a storage quota. Plan copies of the video tree and the SQLite file yourself. Stop the server before copying the database. HLS is a single 720p rendition, not a ladder of qualities. Failed conversions keep the original and are not retried until a restart finds FFmpeg and a pending job.

The first-boot password check does not apply once any user exists. **UPLOAD_USER** and **UPLOAD_PASS** are obsolete. If either is set, the server logs that and continues with the managed accounts. Release binaries are unsigned. Building from source needs the Go toolchain named in `go.mod` (Go 1.27.3). The published archives already contain the server and **tiny-tube-cli**.

# HISTORY

Tiny Tube is written by Serafeim Papastefanos and released under the MIT license. Tag **v1.0** was published on **24 October 2026**. **v1.0.3** (27 October 2026) is the release this page describes. SQLite is the pure-Go `modernc.org/sqlite` driver, so the official binaries do not need CGO.

# SEE ALSO

[tiny-tube-cli](/man/tiny-tube-cli)(1), [ffmpeg](/man/ffmpeg)(1), [nginx](/man/nginx)(1), [sqlite3](/man/sqlite3)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/spapas/tiny-tube)```

```[Documentation](https://github.com/spapas/tiny-tube/blob/master/README.md)```

<!-- verified: 2026-10-28 -->
