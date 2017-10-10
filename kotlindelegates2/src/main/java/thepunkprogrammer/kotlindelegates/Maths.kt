package thepunkprogrammer.kotlindelegates

/**
 * Created by webcubictech2 on 10/10/17.
 */
// mathematical operations

/**
 * Replace maths operation for adding Int, Long with this
 * (Example usage) In the Activity class associated with Delegate class, put:
 * *<pre>
 * {@code
 *
 *     val number = 1 add 2
 *
 *
 * }
 * </pre>
 */
infix fun Double.add(other: Double) = this + other




/**
 * Replace maths operation for substract Int, Long with this
 * (Example usage) In the Activity class associated with Delegate class, put:
 * <pre> <code>
 * {@literal @}Override
 * val number = 1 minus 2
 * </code> </pre>
 */
infix fun Double.minus(other: Double) = this - other

/**
 * Replace maths operation for multiplying Int, Long with this
 * (Example usage) In the Activity class associated with Delegate class, put:
 * <pre> <code>
 * {@literal @}Override
 * val number = 1 into 2
 * </code> </pre>
 */
infix fun Double.into(other: Double) = this * other

/**
 * Replace maths operation for dividing Int, Long with this
 * (Example usage) In the Activity class associated with Delegate class, put:
 * <pre> <code>
 * {@literal @}Override
 * val number = 1 div 2
 * </code> </pre>
 */
infix fun Double.div(other: Double) = this / other

/**
 * Replace maths operation for adding Int, Long with this
 * (Example usage) In the Activity class associated with Delegate class, put:
 * <pre> <code>
 * {@literal @}Override
 * val number = 1 add 2
 * </code> </pre>
 */
infix fun Int.add(other: Int) = this + other

/**
 * Replace maths operation for substract Int, Long with this
 * (Example usage) In the Activity class associated with Delegate class, put:
 * <pre> <code>
 * {@literal @}Override
 * val number = 1 minus 2
 * </code> </pre>
 */
infix fun Int.minus(other: Int) = this - other

/**
 * Replace maths operation for multiplying Int, Long with this
 * (Example usage) In the Activity class associated with Delegate class, put:
 * <pre> <code>
 * {@literal @}Override
 * val number = 1 into 2
 * </code> </pre>
 */
infix fun Int.into(other: Int) = this * other

/**
 * Replace maths operation for dividing Int, Long with this
 * (Example usage) In the Activity class associated with Delegate class, put:
 * <pre> <code>
 * {@literal @}Override
 * val number = 1 div 2
 * </code> </pre>
 */
infix fun Int.div(other: Int) = this / other


/**
 * Replace maths operation for adding Int, Long with this
 * (Example usage) In the Activity class associated with Delegate class, put:
 * <pre> <code>
 * {@literal @}Override
 * val number = 1 add 2
 * </code> </pre>
 */
infix fun Long.add(other: Long) = this + other

/**
 * Replace maths operation for substract Int, Long with this
 * (Example usage) In the Activity class associated with Delegate class, put:
 * <pre> <code>
 * {@literal @}Override
 * val number = 1 minus 2
 * </code> </pre>
 */
infix fun Long.minus(other: Long) = this - other

/**
 * Replace maths operation for multiplying Int, Long with this
 * (Example usage) In the Activity class associated with Delegate class, put:
 * <pre> <code>
 * {@literal @}Override
 * val number = 1 into 2
 * </code> </pre>
 */
infix fun Long.into(other: Long) = this * other

/**
 * Replace maths operation for dividing Int, Long with this
 * (Example usage) In the Activity class associated with Delegate class, put:
 * <pre> <code>
 * {@literal @}Override
 * val number = 1 div 2
 * </code> </pre>
 */
infix fun Long.div(other: Long) = this / other


/**
 * Replace maths operation for adding Int, Long with this
 * (Example usage) In the Activity class associated with Delegate class, put:
 * <pre> <code>
 * {@literal @}Override
 * val number = 1 add 2
 * </code> </pre>
 */
infix fun Float.add(other: Float) = this + other

/**
 * Replace maths operation for substract Int, Long with this
 * (Example usage) In the Activity class associated with Delegate class, put:
 * <pre> <code>
 * {@literal @}Override
 * val number = 1 minus 2
 * </code> </pre>
 */
infix fun Float.minus(other: Float) = this - other

/**
 * Replace maths operation for multiplying Int, Long with this
 * (Example usage) In the Activity class associated with Delegate class, put:
 * <pre> <code>
 * {@literal @}Override
 * val number = 1 into 2
 * </code> </pre>
 */
infix fun Float.into(other: Float) = this * other

/**
 * Replace maths operation for dividing Int, Long with this
 * (Example usage) In the Activity class associated with Delegate class, put:
 * <pre> <code>
 * {@literal @}Override
 * val number = 1 div 2
 * </code> </pre>
 */
infix fun Float.div(other: Float) = this / other