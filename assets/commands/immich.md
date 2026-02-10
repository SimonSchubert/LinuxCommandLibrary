# TAGLINE

self-hosted photo and video backup solution

# TLDR

**Start Immich server**

```docker compose up -d```

**Stop Immich**

```docker compose down```

**View logs**

```docker compose logs -f```

**Backup database**

```docker exec immich_postgres pg_dump > backup.sql```

# SYNOPSIS

**immich** runs as Docker containers

# PARAMETERS

Configured via docker-compose.yml and .env file.

**UPLOAD_LOCATION**
> Photo storage path.

**DB_PASSWORD**
> Database password.

**IMMICH_VERSION**
> Version tag.

# DESCRIPTION

**Immich** is a self-hosted photo and video backup solution. It provides Google Photos-like functionality with mobile apps and web interface.

The platform supports face recognition, geolocation, and automatic organization. It's designed for personal photo management.

# CAVEATS

Runs via Docker. Resource intensive. Mobile apps available.

# HISTORY

Immich was created by **Alex Tran** as an open-source alternative to Google Photos.

# SEE ALSO

[immich-cli](/man/immich-cli)(1), [docker](/man/docker)(1), [photoprism](/man/photoprism)(1)
