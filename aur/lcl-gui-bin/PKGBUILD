# Maintainer: Simon Schubert <sschubert89@gmail.com>
# https://github.com/SimonSchubert/LinuxCommandLibrary

pkgname=lcl-gui-bin
pkgver=4.7.1
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

# Tagged linux-gui-v${pkgver} rather than v${pkgver}: the "Build and Release" workflow
# fires on v* tags and would cut a full multi-platform release. This is Linux only.
_base="https://github.com/SimonSchubert/LinuxCommandLibrary/releases/download/linux-gui-v${pkgver}"
source_x86_64=("LinuxCommandLibrary-${pkgver}-linux-gui-x86_64.tar.gz::${_base}/LinuxCommandLibrary-${pkgver}-linux-gui-x86_64.tar.gz")
source_aarch64=("LinuxCommandLibrary-${pkgver}-linux-gui-aarch64.tar.gz::${_base}/LinuxCommandLibrary-${pkgver}-linux-gui-aarch64.tar.gz")
sha256sums_x86_64=('7cf2e6809bd533f56d8dba1c2a06227ad3e9b3d562bd010fd8f3d803bc813f03')
sha256sums_aarch64=('0cee72a7086b10b5ae082230c5e95df2bfda8df544d34af8f960ba3fd24bbb56')

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
