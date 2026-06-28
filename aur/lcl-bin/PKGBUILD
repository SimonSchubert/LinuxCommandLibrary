# Maintainer: Simon Schubert <sschubert89@gmail.com>
# https://github.com/SimonSchubert/LinuxCommandLibrary

pkgname=lcl-bin
pkgver=4.2.2
pkgrel=1
pkgdesc='Linux command reference and cheat sheets for your terminal'
arch=('x86_64')
url='https://github.com/SimonSchubert/LinuxCommandLibrary'
license=('Apache-2.0')
depends=(
  'glibc'
  'libgcc'
  'libxcrypt-compat'
)
provides=('lcl')
conflicts=('lcl')

source=("LinuxCommandLibrary-${pkgver}-cli-linux-x64.zip::https://github.com/SimonSchubert/LinuxCommandLibrary/releases/download/v${pkgver}/LinuxCommandLibrary-${pkgver}-cli-linux-x64.zip")
sha256sums=('6589101a0a109311a1cff4bcf09619733d8922ccdac148ce80d4258e3182354d')

package() {
    install -Dm755 "${srcdir}/lcl" "${pkgdir}/usr/bin/lcl"
}
