# Maintainer: Simon Schubert <sschubert89@gmail.com>
# https://github.com/SimonSchubert/LinuxCommandLibrary

pkgname=lcl-gui-bin
pkgver=4.9.0
pkgrel=1
pkgdesc='Linux command reference and cheat sheets - native Qt desktop application'
arch=('x86_64' 'aarch64')
url='https://github.com/SimonSchubert/LinuxCommandLibrary'
license=('Apache-2.0')
depends=(
  'gcc-libs'
  'glibc'
  'hicolor-icon-theme'
  # The Kotlin/Native runtime links libcrypt.so.1; Arch ships libcrypt.so.2.
  'libxcrypt-compat'
  'qt6-base'
  'qt6-declarative'
  'qt6-svg'
)
optdepends=(
  'qt6-wayland: native Wayland support'
  'wl-clipboard: copy to clipboard on Wayland'
  'xclip: copy to clipboard on X11'
)
provides=('lcl-gui')
conflicts=('lcl-gui')
options=('!strip')

# The x86_64 binary is built against Arch's own Qt. Arch compiles Qt with
# -mno-direct-extern-access, so linking against another distribution's Qt produces copy
# relocations against protected symbols that Arch's loader rejects at startup
# (GNU_PROPERTY_1_NEEDED_INDIRECT_EXTERN_ACCESS).

# Full v* releases attach linux-gui-{x86_64,aarch64} tarballs on the same GitHub
# release as the other platforms. 4.7.1 used a linux-gui-v* tag because that cut
# was Linux-only and must not fire the "Build and Release" workflow.
_base="https://github.com/SimonSchubert/LinuxCommandLibrary/releases/download/v${pkgver}"
source_x86_64=("LinuxCommandLibrary-${pkgver}-linux-gui-x86_64.tar.gz::${_base}/LinuxCommandLibrary-${pkgver}-linux-gui-x86_64.tar.gz")
source_aarch64=("LinuxCommandLibrary-${pkgver}-linux-gui-aarch64.tar.gz::${_base}/LinuxCommandLibrary-${pkgver}-linux-gui-aarch64.tar.gz")
sha256sums_x86_64=('3a6113d603d80ad58994df2b34bd6d7956d85e794d359b5ff1519ddd97bc6650')
sha256sums_aarch64=('e9b30611fee43d4a4669f3fd118695ea5f53c81f6e2de7d76871b774a338fdfc')

package() {
    cd "${srcdir}/lcl-gui-${pkgver}"

    install -Dm755 bin/lcl-gui "${pkgdir}/usr/bin/lcl-gui"
    install -Dm755 lib/liblcl.so "${pkgdir}/usr/lib/liblcl.so"

    install -dm755 "${pkgdir}/usr/share/lcl"
    cp -r share/lcl/assets "${pkgdir}/usr/share/lcl/assets"
    cp -r share/lcl/icons "${pkgdir}/usr/share/lcl/icons"
    install -Dm644 share/lcl/config.example.toml "${pkgdir}/usr/share/lcl/config.example.toml"
    chmod -R go-w "${pkgdir}/usr/share/lcl"

    install -Dm644 share/applications/lcl-gui.desktop \
        "${pkgdir}/usr/share/applications/lcl-gui.desktop"
    install -Dm644 share/icons/lcl-gui.png \
        "${pkgdir}/usr/share/icons/hicolor/256x256/apps/lcl-gui.png"

    install -Dm644 LICENSE "${pkgdir}/usr/share/licenses/${pkgname}/LICENSE"
}
