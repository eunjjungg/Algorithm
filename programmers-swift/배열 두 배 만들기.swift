import Foundation

func solution(_ numbers:[Int]) -> [Int] {
    var result = [Int](repeating: 0, count: numbers.count)
    
    numbers.indices.forEach { index in
        result[index] = numbers[index] * 2
    }
    return result
}
