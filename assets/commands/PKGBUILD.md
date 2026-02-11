# TAGLINE

Arch Linux package build script format

# TLDR

**Build package**

```makepkg```

**Build and install**

```makepkg -si```

**Update checksums**

```updpkgsums```

**Check PKGBUILD**

```namcap PKGBUILD```

# SYNOPSIS

PKGBUILD specification file for Arch Linux packaging

# DESCRIPTION

**PKGBUILD** is a shell script containing build instructions for Arch Linux packages. It defines metadata, sources, and functions for compiling and packaging software.

Used by makepkg to create .pkg.tar.zst packages.

# BASIC STRUCTURE

```bash
# Maintainer: Name <email>
pkgname=mypackage
pkgver=1.0.0
pkgrel=1
pkgdesc="Description of package"
arch=('x86_64')
url="https://example.com"
license=('GPL')
depends=('dep1' 'dep2')
makedepends=('cmake')
source=("$url/releases/$pkgname-$pkgver.tar.gz")
sha256sums=('SKIP')

build() {
    cd "$pkgname-$pkgver"
    ./configure --prefix=/usr
    make
}

package() {
    cd "$pkgname-$pkgver"
    make DESTDIR="$pkgdir" install
}
```

# VARIABLES

```bash
pkgname     - Package name
pkgver      - Version
pkgrel      - Release number
pkgdesc     - Description
arch        - Architectures
depends     - Runtime dependencies
makedepends - Build dependencies
source      - Source URLs
sha256sums  - Checksums
```

# FUNCTIONS

```bash
prepare()   - Prepare sources
build()     - Compile
check()     - Run tests
package()   - Install to $pkgdir
```

# CAVEATS

Must be named PKGBUILD. Arch-specific format. Always verify checksums. Test with namcap.

# HISTORY

PKGBUILD format was designed for **Arch Linux** by **Judd Vinet**, enabling simple, transparent package building.

# SEE ALSO

[makepkg](/man/makepkg)(8), [pacman](/man/pacman)(8), [namcap](/man/namcap)(1)
