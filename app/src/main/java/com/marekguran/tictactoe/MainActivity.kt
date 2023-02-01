package com.marekguran.tictactoe

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.View.OnFocusChangeListener
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.marekguran.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    private val combinationList: MutableList<IntArray> = ArrayList()
    private var boxPositions = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0) //9 zero
    private var playerTurn = 1
    private var totalSelectedBoxes = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        val decorView = window.decorView
        val uiOptions = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
        decorView.systemUiVisibility = uiOptions
        binding!!.playerOneLayout.setBackgroundResource(R.drawable.black_border)
        binding!!.playerTwoLayout.setBackgroundResource(R.drawable.white_box)
        combinationList.add(intArrayOf(0, 1, 2))
        combinationList.add(intArrayOf(3, 4, 5))
        combinationList.add(intArrayOf(6, 7, 8))
        combinationList.add(intArrayOf(0, 3, 6))
        combinationList.add(intArrayOf(1, 4, 7))
        combinationList.add(intArrayOf(2, 5, 8))
        combinationList.add(intArrayOf(2, 4, 6))
        combinationList.add(intArrayOf(0, 4, 8))
        val getPlayerOneName = intent.getStringExtra("playerOne")
        val getPlayerTwoName = intent.getStringExtra("playerTwo")
        binding!!.playerOneName.text = getPlayerOneName
        binding!!.playerTwoName.text = getPlayerTwoName
        binding!!.image1.setOnClickListener { view ->
            if (isBoxSelectable(0)) {
                performAction(view as ImageView, 0)
            }
        }
        binding!!.image2.setOnClickListener { view ->
            if (isBoxSelectable(1)) {
                performAction(view as ImageView, 1)
            }
        }
        binding!!.image3.setOnClickListener { view ->
            if (isBoxSelectable(2)) {
                performAction(view as ImageView, 2)
            }
        }
        binding!!.image4.setOnClickListener { view ->
            if (isBoxSelectable(3)) {
                performAction(view as ImageView, 3)
            }
        }
        binding!!.image5.setOnClickListener { view ->
            if (isBoxSelectable(4)) {
                performAction(view as ImageView, 4)
            }
        }
        binding!!.image6.setOnClickListener { view ->
            if (isBoxSelectable(5)) {
                performAction(view as ImageView, 5)
            }
        }
        binding!!.image7.setOnClickListener { view ->
            if (isBoxSelectable(6)) {
                performAction(view as ImageView, 6)
            }
        }
        binding!!.image8.setOnClickListener { view ->
            if (isBoxSelectable(7)) {
                performAction(view as ImageView, 7)
            }
        }
        binding!!.image9.setOnClickListener { view ->
            if (isBoxSelectable(8)) {
                performAction(view as ImageView, 8)
            }
        }
        binding!!.image1.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else if (event.action == MotionEvent.ACTION_UP) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
            false
        }
        binding!!.image2.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else if (event.action == MotionEvent.ACTION_UP) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
            false
        }
        binding!!.image3.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else if (event.action == MotionEvent.ACTION_UP) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
            false
        }
        binding!!.image4.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else if (event.action == MotionEvent.ACTION_UP) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
            false
        }
        binding!!.image5.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else if (event.action == MotionEvent.ACTION_UP) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
            false
        }
        binding!!.image6.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else if (event.action == MotionEvent.ACTION_UP) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
            false
        }
        binding!!.image7.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else if (event.action == MotionEvent.ACTION_UP) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
            false
        }
        binding!!.image8.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else if (event.action == MotionEvent.ACTION_UP) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
            false
        }
        binding!!.image9.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else if (event.action == MotionEvent.ACTION_UP) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
            false
        }
        binding!!.image1.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
        }
        binding!!.image2.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
        }
        binding!!.image3.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
        }
        binding!!.image4.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
        }
        binding!!.image5.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
        }
        binding!!.image6.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
        }
        binding!!.image7.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
        }
        binding!!.image8.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
        }
        binding!!.image9.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
        }
    }

    private fun performAction(imageView: ImageView, selectedBoxPosition: Int) {
        boxPositions[selectedBoxPosition] = playerTurn
        if (playerTurn == 1) {
            imageView.setImageResource(R.drawable.player_one)
            if (checkResults()) {
                val resultDialog = ResultDialog(
                    this@MainActivity, binding!!.playerOneName.text.toString()
                            + " " + getString(R.string.winner), this@MainActivity
                )
                resultDialog.setCancelable(false)
                resultDialog.show()
            } else if (totalSelectedBoxes == 9) {
                val resultDialog =
                    ResultDialog(this@MainActivity, getString(R.string.draw), this@MainActivity)
                resultDialog.setCancelable(false)
                resultDialog.show()
            } else {
                changePlayerTurn(2)
                totalSelectedBoxes++
            }
        } else {
            imageView.setImageResource(R.drawable.player_two)
            if (checkResults()) {
                val resultDialog = ResultDialog(
                    this@MainActivity, binding!!.playerTwoName.text.toString()
                            + " " + getString(R.string.winner), this@MainActivity
                )
                resultDialog.setCancelable(false)
                resultDialog.show()
            } else if (totalSelectedBoxes == 9) {
                val resultDialog =
                    ResultDialog(this@MainActivity, getString(R.string.draw), this@MainActivity)
                resultDialog.setCancelable(false)
                resultDialog.show()
            } else {
                changePlayerTurn(1)
                totalSelectedBoxes++
            }
        }
    }

    private fun changePlayerTurn(currentPlayerTurn: Int) {
        playerTurn = currentPlayerTurn
        if (playerTurn == 1) {
            binding!!.playerOneLayout.setBackgroundResource(R.drawable.black_border)
            binding!!.playerTwoLayout.setBackgroundResource(R.drawable.white_box)
        } else {
            binding!!.playerTwoLayout.setBackgroundResource(R.drawable.black_border)
            binding!!.playerOneLayout.setBackgroundResource(R.drawable.white_box)
        }
    }

    private fun checkResults(): Boolean {
        var response = false
        for (i in combinationList.indices) {
            val combination = combinationList[i]
            if (boxPositions[combination[0]] == playerTurn && boxPositions[combination[1]] == playerTurn && boxPositions[combination[2]] == playerTurn) {
                response = true
            }
        }
        return response
    }

    private fun isBoxSelectable(boxPosition: Int): Boolean {
        var response = false
        if (boxPositions[boxPosition] == 0) {
            response = true
        }
        return response
    }

    fun restartMatch() {
        boxPositions = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0) //9 zero
        playerTurn = 1
        totalSelectedBoxes = 1
        binding!!.image1.setImageResource(R.drawable.white_box)
        binding!!.image2.setImageResource(R.drawable.white_box)
        binding!!.image3.setImageResource(R.drawable.white_box)
        binding!!.image4.setImageResource(R.drawable.white_box)
        binding!!.image5.setImageResource(R.drawable.white_box)
        binding!!.image6.setImageResource(R.drawable.white_box)
        binding!!.image7.setImageResource(R.drawable.white_box)
        binding!!.image8.setImageResource(R.drawable.white_box)
        binding!!.image9.setImageResource(R.drawable.white_box)
    }
}